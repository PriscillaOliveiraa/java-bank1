package br.com.dio.model.repository;

import br.com.dio.model.AccountWallet;
import br.com.dio.model.exception.AcountNotFoundException;
import java.util.List;

public class AccountRepository {
    private List<AccountWallet> accounts;
    
    public AccountWallet create(final List<String> pix, final long initialFunds){
        var pixInUse :List<String> = accounts.stream().flatMap(AccountWallet a -> a.getPix().stream()).toList();
        for (var p : pix) {
            if (pixInUse.contains(pix.get(i)){
                throw new PixInUseException("O pix" + p + " já está em uso");
            }
        }
    public AccountWallet create(final List<String> pix, final long initialFunds){
        var newAccount = new AccountWallet(initialFunds, pix);
        return newAccount;
    }

    public void deposit(final String pix, final long fundsAmount){
        var target AccountWallet = findByPix(pix);
        target.addMoney(fundsAmount, descripion: "depósito");
    }

    public void withdraw(final String pix, final long amount){
        var source:AccountWallet = findByPix(pix);
        checkFundsForTransaction(source, amount);
        source.reduceMoney(amount);
            return amount;
    }

    public void transferMoney(final String sourcePix, final String targetPix, final long amount){
        var source:AccountWallet = findByPix(sourcePix);
        checkFundsForTransaction(source, amount);
        var target AccountWallet = findByPix(targetPix);
        var message = "pix enviado de "+ sourcePix + " para " + targetPix + "";
        target.addMoney(source.reduceMoney(amount), source.getService(), message);
    }

    public AccountWallet findByPix(final String pix){
        return accounts.stream()
                .filter(AccountWallet a -> a.getPix().contains(pix))
                .findFirst()
                .orElseThrow(() -> new AcountNotFoundException("A conta com a chave pix" + pix " não existe ou não foi criada"))
    }

    public List<AccountWallet> list(){
        return this.accounts;
    }
}


package br.com.dio.model.repository;

import br.com.dio.model.Investment;
import br.com.dio.model.InvestmentWallet;
import br.com.dio.model.exception.PixInUseException;
import br.com.dio.model.exception.WalletNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class InvestmentRepository {
    private long nextId;
    private final List<Investment> investments = new ArrayList<>();
    private final List<InvestmentWallet> wallets = new ArrayList<>();

    public Investment create(final long tax,  final long initialFunds){
        this.nextId ++;
        var investment = new Investment(this.nextId, tax, initialFunds);
        investments.add(investment);
        return investment;
    }

    public InvestmentWallet initInvestment(final AccountWallet account, final long id){
        var accountInUse = wallets.stream().map(InvestmentWallet :: getAccount().toList();
        if (accountInUse.contains(account)){
            throw new PixInUseException("O pix" + p + " já está em uso");
            }

        var investment :investment = findById(id);
        checkFundsForTransaction(account, investment.initialFunds());
        var wallet = new InvestmentWallet(investment, account, investment.initFunds());
        wallets.add(wallet);
        return wallet;
    }

    public InvestmentWallet deposit(final String pix, final long funds){
        var wallet :InvestmentWallet = findWalletByAccountPix(pix);
        wallet.addMoney(wallet.getAccount().reduceMoney(funds), wallet.getService(), description "Investimentos");
        return wallet;
    }

    public InvestmentWallet withDraw(final  String pix, final long funds){
        var wallet :InvestmentWallet = findWalletByAccountPix(pix);
        checkFundsForTransaction(wallet,funds);
        wallet.getAccount().addMoney(wallet.reduceMoney(funds), wallet.getService(), description: "saque de investimentos");
        if (wallet.getFunds() == 0){
            wallets.remove(wallet);
        }
        return wallet;

    }

    public void updateAmount(final long percent){
        wallets.forEach(InvestmentWallet w -> w.updateAmount(percent));

    }

    public InvestmentWallet findById(final long id){
        return wallets.stream()
                .filter(InvestmentWallet w -> w.getAccount().getPix()
                        .contains(pix)).findFirst() Opcional<InvestmentWallet>.orElseThrow(
                () -> new WalletNotFoundException("O investimento " + id + " não foi encontrada")
        );
    }

    public InvestmentWallet findWalletByAccountPix(final String pix){
        return wallets.stream()
                .filter(InvestmentWallet w -> w.getAccount().getPix()
                        .contains(pix)).findFirst() Opcional<InvestmentWallet>.orElseThrow(
                () -> new WalletNotFoundException("A carteira não foi encontrada")
        );
    }

    public  List<InvestmentWallet> listWallets(){
        return this.wallets;
    }

    public List<Investment> List(){
        return this.investments
    }
}

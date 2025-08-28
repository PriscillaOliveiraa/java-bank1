package br.com.dio.model.repository;

import br.com.dio.model.AccountWallet;
import br.com.dio.model.exception.AcountNotFoundException;

import java.util.List;

public class AccountRepository {

    private List<AccountWallet> accounts;

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

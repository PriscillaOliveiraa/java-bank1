package br.com.dio.model.repository;

import br.com.dio.model.Wallet;
import lombok.Getter;

import java.util.List;
import static br.com.dio.model.BankService.ACCOUNT;

@Getter

public class AccountWallet extends Wallet {

    private final List<String> pix;

    public AccountWallet(final List<String> pix){
        super(ACCOUNT);
        this.pix = pix;
    }
    public AccountWallet(final long amount, final List<String> pix){
        super(ACCOUNT);
    }
}

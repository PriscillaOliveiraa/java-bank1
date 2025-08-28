package br.com.dio.model.repository;

import br.com.dio.model.AccountWallet;
import br.com.dio.model.Money;
import br.com.dio.model.MoneyAudit;
import br.com.dio.model.exception.NotFoundEnoughException;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

import static br.com.dio.model.BankService.ACCOUNT;
import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)

public final class CommonsRepositorys {

    public static void checkFundsForTransaction(final AccountWallet source, final long amount){
        if (source.getFundes() < amount){
            throw new NotFoundEnoughException("Sua conta não tem dinheirnho o suficiente para realizar essa transação");

        }
    }

    public static List<Money> generateMoney(final UUID transactionId, final long funds, final String description){
        var history = new MoneyAudit(transactionId, ACCOUNT, description, OffsetDateTime.now());
        return Stream.generate(() -> new Money(history)).limit(funds).toList();

    }
}

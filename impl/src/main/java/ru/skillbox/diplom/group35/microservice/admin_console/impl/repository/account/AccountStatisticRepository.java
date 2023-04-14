package ru.skillbox.diplom.group35.microservice.admin_console.impl.repository.account;

import org.springframework.stereotype.Repository;
import ru.skillbox.diplom.group35.library.core.repository.BaseRepository;
import ru.skillbox.diplom.group35.microservice.admin_console.domain.model.account.AccountStatistic;

/**
 * AccountStatisticRepository
 *
 * @author Georgii Vinogradov
 */

@Repository
public interface AccountStatisticRepository extends BaseRepository<AccountStatistic> {
}

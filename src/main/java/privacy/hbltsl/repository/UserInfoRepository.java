package privacy.hbltsl.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import privacy.hbltsl.model.UserInfo;

@Repository
public interface UserInfoRepository extends PagingAndSortingRepository<UserInfo, Long> {

}

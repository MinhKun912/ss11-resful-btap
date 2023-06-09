package ra.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ra.model.Blog;

@Repository
public interface IBlogRepository extends PagingAndSortingRepository<Blog,String> {
}

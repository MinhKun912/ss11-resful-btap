package ra.service.blog;

import ra.model.Blog;
import ra.service.IGenerateService;

public interface IBlogService extends IGenerateService<Blog> {
    Iterable<Blog> findAllByCustomer(Customer customer);
}

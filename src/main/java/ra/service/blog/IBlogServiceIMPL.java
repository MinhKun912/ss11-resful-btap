package ra.service.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.model.Blog;
import ra.repository.IBlogRepository;

import java.util.Optional;
@Service
public class IBlogServiceIMPL implements IBlogService{
    @Autowired
    private IBlogRepository iBlogRepository;
    @Override
    public Iterable<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return iBlogRepository.findById(String.valueOf(id));
    }

    @Override
    public void save(Blog blog) {
iBlogRepository.save(blog);
    }

    @Override
    public void remove(Long id) {
iBlogRepository.deleteById(String.valueOf(id));
    }

    @Override
    public Iterable<Blog> findAllByCustomer(Customer customer) {
        return iBlogRepository.findAllByCustomer(customer);
    }
}

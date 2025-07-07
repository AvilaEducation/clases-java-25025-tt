package techlab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techlab.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}

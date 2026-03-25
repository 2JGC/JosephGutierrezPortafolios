
package Tienda_Joseph.demo.repository;

import Tienda_Joseph.demo.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByUsernameAndActivoTrue(String username);
}
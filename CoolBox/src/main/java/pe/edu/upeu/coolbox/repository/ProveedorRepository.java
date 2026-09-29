package pe.edu.upeu.coolbox.repository;

import pe.edu.upeu.coolbox.model.Proveedor;

public class ProveedorRepository extends AbstractJpaRepository<Proveedor, Long> {

    private long sequence = 1;

    @Override
    protected Long getId(Proveedor entity) {
        return entity.getIdProveedor();
    }

    @Override
    protected void setId(Proveedor entity, Long id) {
        entity.setIdProveedor(id);
    }

    @Override
    protected Long generateId() {
        return sequence++;
    }

    public void seedData() {
        if (findAll().isEmpty()) {
            save(new Proveedor(generateId(),
                    "12345678", "Proveedor General", "DNI", "987654321", "proveedor@gmail.com", "Juliaca"));
        }
    }
}

package pe.edu.upeu.coolbox.service;

import pe.edu.upeu.coolbox.dto.ComboBoxOption;
import pe.edu.upeu.coolbox.model.Proveedor;

import java.util.List;

public interface IProveedorService extends ICrudGenericoService<Proveedor, Long> {
    List<ComboBoxOption> listarTipoDocumento();
}

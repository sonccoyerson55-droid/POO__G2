MERGE INTO usuario (id_usuario, usuario, clave, estado, id_perfil) KEY (id_usuario)
    VALUES (2, 'pepito', '321', 'ACTIVO', 1),
           (3, 'juanito', '123', 'ACTIVO', 3);
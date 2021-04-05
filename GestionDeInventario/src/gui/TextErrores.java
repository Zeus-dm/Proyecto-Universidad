
package gui;


public enum TextErrores {
    
    NOMBRE_VACIO("*Error: Campo nombre vacío"),
    EDAD_VACIO("*Error: Campo edad vacío"),
    EDAD_NO_NUMERO("*Error: Edad debe ser un número"),
    EDAD_NO_RANGO("*Error: Edad fuera de rango"),
    MAXIMO_CARACTERES("Error: Máximo 40 caracteres"),
    EMAIL_VACIO("*Error: Campo E-mail Vacío"),
    EMAIL_INVALIDO("*Error: Email inválido"),
    TELEFONO_VACIO("*Error: Campo Teléfono vacío"),
    TELEFONO_INVALIDO("*Error: Teléfono debe ser un número"),
    TELEFONO_RANGO("*Error: Teléfono debe tener 8 dígitos"),
    DIRECCION_VACIO("*Error: Campo Dirección vacío"),
    DESCRIPCION_RANGO("*Error: Máximo de 300 caracteres"),
    BARCODE_VACIO("*Error: Campo Código de barras vacío"),
    BARCODE_RANGO("*Error: Código de barras debe tener 9 dígitos"),
    BARCODE_DUPLICADO("*Error: Codigo de barras ya existe"),
    PRECIO_VACIO("*Error: Campo Precio vacío"),
    PRECIO_INVALIDO("*Error: Precio debe ser un número"),
    PRECIO_CERO("*Error: Precio debe ser mayor a 0"),
    STOCK_VACIO("*Error: Campo Stock Vacío"),
    STOCK_CERO("*Error: Stock debe ser mayor a 0"),
    STOCK_INVALIDO("*Error: Stock debe ser un número"),
    HEXADECIMAL_INVALIDO("*Error: Hexadecimal inválido"),
    HEXADECIMAL_DUPLICADO("*Error: Hexadecimal duplicado"),
    USUARIO_PASSWORD_INCORRECTOS("*Error: Usuario o contraseña incorrectos"),
    USUARIO_EXISTENTE("*Error: Usuario ya existe"),
    PASSWORD_DIFERENTES("*Error: Contraseñas no coinciden");
    
    private final String texto ;

    public String getTexto() {
        return texto;
    }

    private TextErrores(String texto) {
        this.texto = texto;
    }
    
}

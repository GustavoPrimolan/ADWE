
package tratamentos;

public class TrataEmocao {
    public static String trataEmocao(String valor) {
        valor = valor.replaceAll("[ÂÀÁÄÃ]", "a");
        valor = valor.replaceAll("[âãàáä]", "a");
        valor = valor.replaceAll("[ÊÈÉË]", "E");
        valor = valor.replaceAll("[êèéë]", "e");
        valor = valor.replaceAll("[ÎÍÌÏ]", "I");
        valor = valor.replaceAll("[îíìï]", "i");
        valor = valor.replaceAll("[ÔÕÒÓÖ]", "O");
        valor = valor.replaceAll("[ôõòóö]", "o");
        valor = valor.replaceAll("[ÛÙÚÜ]", "U");
        valor = valor.replaceAll("[ûúùü]", "u");
        valor = valor.replaceAll("Ç", "C");
        valor = valor.replaceAll("ç", "c");
        valor = valor.replaceAll("[ýÿ]", "y");
        valor = valor.replaceAll("Ý", "Y");
        valor = valor.replaceAll("ñ", "n");
        valor = valor.replaceAll("Ñ", "N");
        valor = valor.replaceAll("¹", "1");
        valor = valor.replaceAll("²", "2");
        valor = valor.replaceAll("³", "3");
        valor = valor.replaceAll("ª", "a");
        valor = valor.replaceAll("º", "o");
        valor = valor.toLowerCase();
        return valor;
    }
}

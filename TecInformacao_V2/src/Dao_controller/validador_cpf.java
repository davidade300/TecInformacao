package Dao_controller;

public class validador_cpf{
    public static boolean validar(String cpf) {
        if (cpf.length() != 11) {
            return false;
        }

        int[] numeros = new int[11];
        for (int i = 0; i < 11; i++) {
            numeros[i] = Character.getNumericValue(cpf.charAt(i));
        }

        // Verificar se todos os dígitos são iguais
        boolean iguais = true;
        for (int i = 1; i < 11; i++) {
            if (numeros[i] != numeros[i - 1]) {
                iguais = false;
                break;
            }
        }
        if (iguais) {
            return false;
        }

        // Verificar o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += numeros[i] * (10 - i);
        }
        int resto = soma % 11;
        int verificador1 = (resto < 2) ? 0 : 11 - resto;
        if (numeros[9] != verificador1) {
            return false;
        }

        // Verificar o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += numeros[i] * (11 - i);
        }
        resto = soma % 11;
        int verificador2 = (resto < 2) ? 0 : 11 - resto;
        if (numeros[10] != verificador2) {
            return false;
        }

        // se  CPF válido
        return true;
    }
}

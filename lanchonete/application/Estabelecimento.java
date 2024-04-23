package lanchonete.application;

import lanchonete.model.entidades.Almoxarife;
import lanchonete.model.entidades.Atendente;
import lanchonete.model.entidades.Cliente;
import lanchonete.model.entidades.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //
        cozinheiro.lavarIngredientes();
        cozinheiro.baterVitaminaLiquidificador();
        cozinheiro.selecionarIngredientesLanche();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();
        cozinheiro.prepararVitamina();
        //
        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.fritarIngredientesLanche();
        cozinheiro.prepararCombo();
        cozinheiro.selecionarIngredientesLanche();
        //
        Almoxarife almoxarife = new Almoxarife();
        //conzinheiro
        cozinheiro.pedirIngredientes(almoxarife);
        cozinheiro.pedirParaTrocarGas(almoxarife);
        //almoxarife
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();
        almoxarife.entregarIngrediente();
        almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        atendente.pegarLancheCozinha();
        atendente.pegarPedidoBalcao();
        atendente.servindoMesa();
        atendente.trocarGas();
        atendente.receberPagamento();

        Cliente cliente = new Cliente();
        cliente.consultarSaldoAplicativo();
        cliente.escolherLanches();
        cliente.fazerPedido();
        cliente.pegarPedidoBalcao();
        cliente.pagarConta();
    }
}

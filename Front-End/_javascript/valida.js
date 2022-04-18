 
function validaVazios(campo, valorIni, nome_campo) {
    if (campo.value == "" || campo.value == null || valorIni == campo.value) {
        alert("Falta preenchimento no campo " + nome_campo + " do seu formulário!");
        return false;
    }
    return true;
}

function validaCpf() {
    let campo = document.getElementById('cpf').value;
    let valido = /^[0-9]{3}\.[0-9]{3}\.[0-9]{3}\-[0-9]{2}$/
    if (!valido.test(campo)) {
        alert('Valor informado não condiz');
        document.form.cpf.focus();
        return false;
    }
    return true;
}

function mascCpf(campo) {    
    var cpf = campo.value
    if (cpf.length == 3 || cpf.length == 7) {
        campo.value = cpf += ".";
    } if (cpf.length == 11) {
        campo.value = cpf += "-";
    }
}

function validaTelefone() {
    let campo = document.getElementById('telefone');
    let valido = /^\([0-9]\)\ [0-9]{5}\-[0-9]{4}$/
    if (!valido.test(campo)) {
        alert('Valor informado não condiz');
        document.form.telefone.focus();
        return false;
    }
    return true;
}

function mascTelefone(campo) {
    var telefone = campo.value
    if (telefone.length == 0) {
        campo.value = telefone += '(';
    } if (telefone.length == 3) {
        campo.value = telefone +=')';
    } if (telefone.length == 4) {
        campo.value = telefone += " ";
    } if (telefone.length == 9) {
        campo.value = telefone += "-";
    }
}

function limpa_formulário_cep() {
    //Limpa valores do formulário de cep.
    document.getElementById('rua').value=("");
    document.getElementById('bairro').value=("");
    document.getElementById('cidade').value=("");
    document.getElementById('uf').value=("");
    document.getElementById('ibge').value=("");
}

function meu_callback(conteudo) {
if (!("erro" in conteudo)) {
    //Atualiza os campos com os valores.
    document.getElementById('rua').value=(conteudo.logradouro);
    document.getElementById('bairro').value=(conteudo.bairro);
    document.getElementById('cidade').value=(conteudo.localidade);
    document.getElementById('uf').value=(conteudo.uf);
    document.getElementById('ibge').value=(conteudo.ibge);
} //end if.
else {
    //CEP não Encontrado.
    limpa_formulário_cep();
    alert("CEP não encontrado.");
}
}

function pesquisacep(valor) {

//Nova variável "cep" somente com dígitos.
var cep = valor.replace(/\D/g, '');

//Verifica se campo cep possui valor informado.
if (cep != "") {

    //Expressão regular para validar o CEP.
    var validacep = /^[0-9]{8}$/;

    //Valida o formato do CEP.
    if(validacep.test(cep)) {

        //Preenche os campos com "..." enquanto consulta webservice.
        document.getElementById('rua').value="...";
        document.getElementById('bairro').value="...";
        document.getElementById('cidade').value="...";
        document.getElementById('uf').value="...";
        document.getElementById('ibge').value="...";

        //Cria um elemento javascript.
        var script = document.createElement('script');

        //Sincroniza com o callback.
        script.src = 'https://viacep.com.br/ws/'+ cep + '/json/?callback=meu_callback';

        //Insere script no documento e carrega o conteúdo.
        document.body.appendChild(script);

    } //end if.
    else {
        //cep é inválido.
        limpa_formulário_cep();
        alert("Formato de CEP inválido.");
    }
} //end if.
else {
    //cep sem valor, limpa formulário.
    limpa_formulário_cep();
}
};

function validaNome() {
    let valido = /^[A-Za-záàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ"\s]+$/;
    if(!valido.test(nome)) {
        alert("Não poder ter números no seu nome!");
        nome = "";
        return false;
    }
    return true;
}

 function validaCampos() {
    let nome = document.getElementById('nome');
    if (validaVazios(nome, "", "Nome") == false) {
        return false;
    }
    let cpf = document.getElementById('cpf');
    if (validaVazios(cpf, "", "Cpf") == false) {
        return false;
    }
    let telefone = document.getElementById("telefone");
    if (validaVazios(telefone, "" , "Telefone")) {   
        return false;
    }
    let celular = document.getElementById('celular');
    if (validaVazios(celular, "", "Celular") == false) {
        return false;
    }        
    let cep = document.getElementById('cep');
    if (validaVazios(cep, "", "CEP")) {
        return false;
    }
    let logradouro = document.getElementById('logradouro');
    if (validaVazios(logradouro, "", "Logradouro")) {
        return false;
    }
    let numero = document.getElementById('numero');
    if (validaVazios(numero, "", "Numero")) {
        return false;
    }
    let complemento = document.getElementById('complemento');
    if (validaVazios(complemento, "", "Complemento")) {
        return false;
    }
    let bairro = document.getElementById('bairro');
    if (validaVazios(bairro, "", "Bairro")) {
        return false;
    }
    let cidade = document.getElementById('cidade');
    if (validaVazios(cidade, "", "Cidade")) {
        return false;
    }
    let estado = document.getElementById('estado');
    if (validaVazios(estado, "", "Estado")) {
        return false;
    }
}

function validaTudo() {
    validaCpf()
    validaCampos();
}
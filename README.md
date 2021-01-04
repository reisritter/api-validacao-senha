<h1>Projeto api-validacao-senha</h1>
<small>O presente repositório contém apenas a api. Caso queira checar o front-end, basta clicar <a href="https://github.com/reisritter/app-validacao/tree/master">aqui</a>.</small>
<h3>Descrição</h3>
<p>A premissa do projeto consiste na criação de uma api que tenha a capacidade de validar uma senha, seguindo as seguintes regras:</p>
<ul>
  <li>Deve possuir mais 9 ou mais caracteres;</li>
  <li>Ao menos 1 dígito;</li>
  <li>Ao menos 1 letra minúscula;</li>
  <li>Ao menos 1 letra maiúscula;</li>
  <li>Ao menos 1 caractere especial, sendo eles:  !@#$%^&*()-+  ;</li>
  <li>E não possuir caracteres repetidos dentro do conjunto.</li>
</ul>
<h3>Arquitetura</h3>
<p>Para isso, na criação da API, foi utilizado java com SpringBoot. Já na criação do front-end foi utilizado Angular com Bootstrap.</p>
<h4>Back-end</h4>
<p>Na criação da api, foi utilizado a seguinte organização de pastas:</p>
<ul>
  <li>Model > Pacote que possui as classes modelos;</li>
  <li>Service > Pacote que possui as classes que implementam as regras de negócio;</li>
  <li>Controller > Pacote que possui as classes que realizam as requisições;</li>
  <li>Config > Pacote que possui as classes com as configurações do projeto.</li>
</ul>
<p>Foi criado apenas uma entidade, "Usuario", com o atributo "usuarioSenha". </p>
<h3>Instruções</h3>
<p>O deploy do projeto foi realizado no Heroku. Clique aqui para ser redirecionado para a aplicação.</p>
https://app-validacao-senha.herokuapp.com/
<p>Ela possui os seguintes elementos:</p>
<ul>
  <li>Um campo de texto para inserir a senha;</li>
  <li>Um botão para a validação.</li>  
</ul>
<p>Basta inserir a senha no campo de texto e apertar o botão para validar a mesma.</p>
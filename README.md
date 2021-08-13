# xmlnota
Converte o XML de NF-e em uma Nota fiscal.

Basta instanciar um com.asandrob.nfe.servico.NotaXml<br>
Chamar o método diretorioRaiz, passando o diretório e a extesão dos arquivos (xml neste caso)<br>
Depois disso, com  getNfes() receberá um List<Nfe> com todos os XML's em formato de NF-e.<br>

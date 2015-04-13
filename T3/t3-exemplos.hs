--As funções de alta ordem any e all são pré-definidas na biblioteca Prelude do Haskell (veja seção Special Folds). Estude e teste essas --funções e apresente 2 exemplos de uso de cada uma delas.
1) Any testa se algum dos elementos de uma lista passa por tais condições.
Exemplo: any (==10) ListaInteiros -> dado essa lista, ela vai retornar True se encontrar algum elemento que seja igual a 10
Exemplo2: any (=='a') String -> irá retornar True se encontrar algum elemento da String que seja igual a 'a'
All, diferentemente de Any, irá retornar True somente se todos elementos da lista passarem por tais condições
Exemplo: all (==10) ListaInteiros -> dado essa lista, irá retornar True somente se todos elementos da lista forem iguais a 10
Exemplo: all (==True) ListaBool -> esse exemplo eu usei em uma das questoes do trabalho. Dado uma lista de Bools, irá retornar True se todos elementos da lista forem True.
-Referencias-
http://zvon.org/other/haskell/Outputprelude/all_f.html
http://zvon.org/other/haskell/Outputprelude/any_f.html


--Em Haskell, o símbolo '$' pode ser usado para escrever códigos ainda mais curtos. Descubra seu significado e apresente 2 exemplos de uso.
2)O uso do símbolo $ acarreta no mesmo efeito da utilização de () para distinguir o parâmetro da função ou expressão matemática. Tudo que estiver a direita de $ será o parâmetro da função que estiver a esquerda de $.
Exemplo 1
 isInt x = all (==True) (map isDigit x)
 A função map está rodeada por (), pois necessita especificar que além de ser uma função, e o parâmetro da função all que foi chamada anteriormente. 
 Podemos escrever essa função dessa maneira:
 isInt x = all (==True) $ map isDigit $ x
 É necessário o $ depois de isDigit para específicar que x também é parametro da função map. 
 
 Exemplo 2
 product (map sqrt [1..10])
 Nessa expressão, ocorre a multiplicação das raízes quadradas dos números de 1 a 10. Como é necessário especificar o que é parametro da função "product",  se utiliza os parênteses. Mas, como visto anteriormente, é possível trocar para:
 product $ map sqrt [1..10]
 Assim, o parâmetro da função product fica especificado como map sqrt [1..10].
 
 -Referencias-
 http://learnyouahaskell.com/higher-order-functions#function-application
 
 --Haskell permite composição de funções, exatamente como em matemática. Descubra como fazer isso e apresente 2 exemplos de aplicação de --funções compostas.
 3)Para utilizar composição de funções, se utiliza um ponto. Assim, o resultado da função será aplicada como parâmetro imediatamente para a outra função que a compõe, e assim por diante.
 
 
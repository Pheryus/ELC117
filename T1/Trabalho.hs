--1) Escreva uma função hasEqHeads :: [Int] -> [Int] -> Bool que verifica se as 2 listas possuem o mesmo primeiro elemento. Exemplo de uso:

hasEqHeads :: [Int] -> [Int] -> Bool
hasEqHeads l1 l2 = if (head l1) == (head l2) then True else False 

-- 3)Escreva uma função recursiva add10, que adicione a constante 10 a cada elemento de uma lista, produzindo outra lista.
add10 :: [Int] -> [Int]
add10 [] = []
add10 ns = (head ns) + 10 : add10(tail ns)

-- 4) Escreva uma função recursiva addComma, que adicione uma vírgula no final de cada string contida numa lista.

addComma :: [String] -> [String]
addComma [] = []
addComma ns = ((head ns) ++ ",") : addComma (tail ns) 

-- 5) Refaça os 2 exercícios anteriores usando a função de alta ordem 'map'.

newadd10 :: [Int] -> [Int]
newadd10 ns = map ( + 10) ns

newaddComma :: [String] -> [String]
newaddComma ns = map (++ ",") ns

-- 6)Crie uma função htmlListItems :: [String] -> [String], que receba uma lista de strings e retorne outra lista contendo as strings --formatadas como itens de lista em HTML.

htmlListItems :: [String] -> [String]
htmlListItems [] = []
htmlListItems ns = map ("<LI>"++) (map (++ "</L>") ns)

-- 7) Crie uma função recursiva charFound :: Char -> String -> Bool, que verifique se o caracter (primeiro argumento) está contido na string.

charFound :: Char -> String -> Bool
charFound c s
	| s == [] = False
	| (head s) == c = True
	| otherwise = charFound c (tail s)	
	
-- 8) Reescreva a função anterior sem recursão, usando outras funções pré-definidas já vistas em aula.
charFound2 :: Char -> String -> Bool
charFound2 c s
	| s == [] = False
	| filter (== c) s /= "" = True
	| otherwise = False	
	
-- 9) Use a função de alta ordem 'zipWith' para produzir uma função que obtenha as diferenças, par a par, dos elementos de duas listas.
funczipWith :: [Int] -> [Int] -> [Int]
funczipWith x y = zipWith (-) x y

-- Funções de Alta Ordem
-- 1) Dada uma lista de números, calcular 2*n+1 para cada número n contido na lista.

duplicamais1 :: [Int] -> [Int]
duplicamais1 x = map (+1) (map (2*) x)  

-- 2) Dadas duas listas X e Y de números inteiros, calcular 4*x+2*y+1 para cada par de números x e y pertencentes às listas.
calculogrande :: [Int] -> [Int] -> [Int]
calculogrande x y = zipWith (\x y -> 4*x + 2*y + 1) x y

-- 3)Dada uma lista de strings, produzir outra lista com strings de 10 caracteres, usando o seguinte esquema: strings de entrada 
-- com mais de 10 caracteres são truncadas, strings com até 10 caracteres são completadas com '.' até ficarem com 10 caracteres. 
	 
greaterten :: [String] -> [String]
greaterten s = map (take 10) (map (++ repeat '.') s)

-- 4)Dada uma lista de idades, selecionar as que são maiores que 20 e, para cada uma, calcular o ano de nascimento correspondente 
agegreaterthen20 :: [Int] -> [Int]
agegreaterthen20 x = map (2015 -) (filter (> 20) x)
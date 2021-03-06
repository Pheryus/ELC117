--Escreva uma função recursiva firstName :: String -> String que, dado o nome completo de uma pessoa, obtenha seu primeiro nome. Suponha que --cada parte do nome seja separada por um espaço e que não existam espaços no início ou fim do nome.
import Data.Char
firstName :: String -> String
firstName (x:xs) =  if x /= ' ' then x:firstName xs else []


--Escreva uma função firstName' :: String -> String com o mesmo resultado do exercício anterior, mas sem usar recursão. Dica: estude funções --pré-definidas em Haskell (List operations -> Sublists)
firstName' :: String-> String
firstName' x = takeWhile ( /= ' ') x

--Escreva uma função lastName :: String -> String que, dado o nome completo de uma pessoa, obtenha seu último sobrenome. Suponha que cada parte
--do nome seja separada por um espaço e que não existam espaços no início ou fim do nome.
lastName :: String -> String
lastname [] = []
lastName x = last (words x)

--Escreva uma função não-recursiva userName :: String -> String que, dado o nome completo de uma pessoa, crie um nome de usuário (login) da --pessoa, formado por: primeira letra do nome seguida do sobrenome, tudo em minúsculas. Dica: estude as funções pré-definidas no módulo --Data.Char, para manipulação de maiúsculas e minúsculas.
userName :: String -> String
userName x = map toLower ((head x) : last(words x))

--Escreva uma função não-recursiva encodeName :: String -> String que substitua vogais em uma string, conforme o esquema a seguir: a = 4, e = --3, i = 1, o = 0, u = 00.
encodeName::String->String
encodeName str= 
	let letra x
		|x=='a' || x == 'A' ="4"
		|x=='e'|| x == 'E' ="3"
		|x=='i'|| x == 'I'="1"
		|x=='o'|| x == 'O'="0"
		|x=='u'|| x == 'U'="00"
		|otherwise=[x]
	in concat (map (letra) str)


--Escreva uma função isElem :: Int -> [Int] -> Bool que verifique se um dado elemento pertence a uma lista, conforme os exemplos
isElem :: Int -> [Int] -> Bool
isElem x y = if x == (head y) then True else if (tail y) == [] then False else isElem x (tail y)

--Escreva uma função recursiva que retorne o número de vogais em uma string.
numbvogal :: String -> Int
numbvogal [] = 0
numbvogal (x:xs)
	 | x == 'a' = 1 + numbvogal xs
	 | x == 'e' = 1 + numbvogal xs
	 | x == 'i' = 1 + numbvogal xs
	 | x == 'o' = 1 + numbvogal xs
	 | x == 'u' = 1 + numbvogal xs
	 | x == 'A' = 1 + numbvogal xs
	 | x == 'E' = 1 + numbvogal xs
	 | x == 'I' = 1 + numbvogal xs
	 | x == 'O' = 1 + numbvogal xs
	 | x == 'U' = 1 + numbvogal xs
	 | otherwise = 0 + numbvogal xs
	 
--Escreva uma função não-recursiva que retorne o número de consoantes em uma string.
numbconso :: String -> Int
numbconso x = length [y | y<-x, y/= 'a', y/= 'e', y/= 'i', y/= 'o', y/= 'u', y/= 'A', y/= 'E', y/= 'I', y/= 'O', y/= 'U']

--Escreva uma função não-recursiva isInt :: String -> Bool que verifique se uma dada string só contém dígitos (0 a 9).
isInt :: String -> Bool
isInt x = all (==True) (map isDigit x)


--Escreva uma função não-recursiva strToInt :: String -> Int que converta uma string em um número inteiro, fazendo operações aritméticas com --seus dígitos (p.ex.: "356" = 3*100 + 5*10 + 6*1 = 356). Considere que a string seja um número válido, isto é, só contenha dígitos de 0 a 9. --Dica: se não souber por onde começar, estude o exemplo de validação de CPF visto em aula.
strToInt :: String -> Int
strToInt pal = sum (zipWith (*) (map(digitToInt) pal) (reverse [10^x | x <- [0,1..((length pal)-1)]]))
	

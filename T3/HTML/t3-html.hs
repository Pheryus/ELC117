main :: IO ()
main = do
    strcontent <- readFile infile
    let listofstrlist = map (splitOnChar ',') (lines strcontent)
        strtuplelist = map (\lis -> (head lis, last lis)) listofstrlist
    writeFile outfile (mkHtmlURLItemsDoc "UsuÃ¡rios Cadastrados no NCC" strtuplelist)
    putStrLn "Teste!"
    where 
    infile = "logins.csv"
    outfile = "output.html"


-- Esta funÃ§Ã£o deve ser alterada para chamar outras funÃ§Ãµes que vÃ£o
-- construir o documento HTML
mkHtmlURLItemsDoc :: String -> [(String,String)] -> String
mkHtmlURLItemsDoc title lis = "<!DOCTYPE html><html><head><title>Usuários Cadastrados no NCC</title></head><body><ul>" ++ (foldr1 (++) (addaluno(map snd lis) (map fst lis)) ++ "</ul></body></html>")


addaluno :: [String] -> [String] -> [String]
addaluno reg nome 
	    |reg == [] = []
	    |nome == [] = []
	    |otherwise = ("<li><a href=http://www.inf.ufsm.br/~" ++ (head reg) ++ ">" ++ (head nome) ++ "</a></li>"): addaluno (tail reg) (tail nome) 


-- Decompoe string usando um caracter delimitador
splitOnChar :: Char -> String -> [String]
splitOnChar x y = auxSplitOnChar x y [[]]

auxSplitOnChar :: Char -> String -> [String] -> [String]
auxSplitOnChar x [] z = reverse (map reverse z)
auxSplitOnChar x (y:ys) (z:zs) = 
	if y == x then 
            auxSplitOnChar x ys ([]:(z:zs)) 
        else 
            auxSplitOnChar x ys ((y:z):zs)

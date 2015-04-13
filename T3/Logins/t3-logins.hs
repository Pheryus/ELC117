import Data.Char

main :: IO ()
main = do
    strcontent <- readFile "nomes.csv"
    let strlist = lines strcontent
	strname = zipWith (++) (strlist) (map (","++)(map (userName) strlist))
    writeFile "logins.csv" (unlines strname)


userName :: String -> String
userName x = map toLower ((head x) : last(words x))

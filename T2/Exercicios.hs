geraPotencias :: Int -> [Int]
geraPotencias x = [2 ^ x| x <- [x, x-1 .. 0] ]


addSuffix :: String -> [String] -> [String]
addSuffix s str = [x ++ s | x <- str ]

anosDeNascimento :: [Int] -> [Int]
anosDeNascimento n = [2015 - x | x <- n, x > 20 ] 
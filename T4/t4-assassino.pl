


insano(maria).

pobre(bernardo).
pobre(bia).
pobre(maria).
pobre(pedro).

relacionamento(alice,henrique).
relacionamento(henrique,alice).
relacionamento(maria,henrique).
relacionamento(henrique,maria).
relacionamento(maria,adriano).
relacionamento(adriano,maria).
relacionamento(caren,adriano).
relacionamento(adriano,caren).
relacionamento(alice,bernardo).
relacionamento(bernardo,alice).
relacionamento(anita,bernardo).
relacionamento(bernardo,anita).
relacionamento(pedro,anita).
relacionamento(anita,pedro).
relacionamento(pedro,alice).
relacionamento(alice,pedro).

ciumes(X,Y):- relacionamento(X,W),relacionamento(Y,W).


arma(X):- aptquarta(X);smquarta(X).
chaveroubada(X):- smterça(X);poaterca(X).

vitima(anita).


motivo(X):- ciumes(X,anita); insano(X); pobre(X).

acesso(X):- arma(X),chaveroubada(X),(aptsexta(X);aptquinta(X)).

assassino(X):- motivo(X), acesso(X).











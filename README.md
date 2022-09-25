<h1> 📚 Entendendo conceitos de Sobrecarga no Java </h1>

### 🤔 O que são sobrecargas?

<p> Sobrecarga é a capacidade de definir métodos para diferentes
contextos, mas preservando seu nome.

Altera a assinatura do método, mantendo o nome

Ass = nome + parâmetros

</p>

### Exemplos:

```shell
    converterParaInteiro (float f);
    converterParaInteiro (double d);
    converterParaInteiro (String s);
    converterParaInteiro (float f, RoundType rd);
    converterParaInteiro (double d, RoundType rd);
    converterParaInteiro (String s, RoundType rd);
    converterParaInteiro (RoundType rd, String s);
    converterParaInteiro ();
```

### 🤔 Como sobrecarregar um método Java?

<p> O que você precisa lembrar para usar sobrecarga de métodos é o seguinte.Uma classe pode fazer a sobrecarga nos métodos que foram declardos dentro dela
e também nos métodos herdados.</p>

```shell
- Métodos sobrecarregados devem possuir o mesmo nome.

- Métodos sobrecarregados devem possuir listas de parâmetros diferentes.
```

---

## Implementação de Array Personalizado em Kotlin

Você foi contratado para desenvolver uma implementação personalizada de um array em Kotlin. O objetivo é criar uma classe que permita aos usuários adicionar elementos em qualquer posição do array, remover elementos de qualquer posição, consultar se um elemento existe no array e verificar se um elemento está em uma determinada posição.

A classe `CustomArray` deve ter as seguintes funcionalidades:

- `add(element: T, index: Int)`: adiciona o elemento `element` na posição `index` do array. Se a posição já estiver ocupada, os elementos subsequentes devem ser deslocados para a direita para abrir espaço. Certifique-se de atualizar corretamente o tamanho do array.
- `remove(index: Int)`: remove o elemento na posição `index` do array. Os elementos subsequentes devem ser deslocados para a esquerda para preencher o espaço vazio. Certifique-se de atualizar corretamente o tamanho do array.
- `contains(element: T): Boolean`: verifica se o elemento `element` está presente no array. Retorna `true` se o elemento for encontrado e `false` caso contrário.
- `containsAt(index: Int, element: T): Boolean`: verifica se o elemento `element` está na posição `index` do array. Retorna `true` se o elemento for encontrado na posição especificada e `false` caso contrário.
- `size(): Int`: retorna o tamanho atual do array.

Sua tarefa é implementar a classe `CustomArray` em Kotlin, seguindo as especificações acima. Certifique-se de testar sua implementação utilizando diferentes cenários para garantir que todas as funcionalidades estejam corretas.

Lembre-se de utilizar boas práticas de programação e escrever um código limpo e legível. Comente seu código conforme necessário para explicar a lógica por trás das operações realizadas.

Você pode utilizar a classe `ArrayList` como referência para entender a estrutura de um array dinâmico em Kotlin, mas não deve utilizar a implementação pronta da classe `ArrayList` para resolver este exercício.

**Dica:** Utilize a função `Array.copyOf` para redimensionar o array quando necessário.
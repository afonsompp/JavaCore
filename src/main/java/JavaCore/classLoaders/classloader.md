# Como o classLoader funciona

O class loader é uma parte da JVM, A JVM tenta localizar e carregar a classe em tempo de execução, para realizar a localização a JVM utiliza o  nome completo da classe.

O metodo Java.lang.ClassLoader.loadClass() é responsável por realizar o carregando da classe em tempo de execução.

se a classe ainda não foi carregada, o método delega essa tarefa para a classe pai, e essse processo vai acontece recursivamente.

Se a classe pai não encontrar a classe requistada, então as classes filhos irão executar o método java.net.URLClassLoader.findClass() para buscar no seu sistema de arquivo a classe.

Caso ainda sim a classe não seja encontrada, então o sistema retorna uma exceção  java.lang.NoClassDefFoundError ou java.lang.ClassNotFoundException.

O class loader segue um delegation model onde quando uma requisição é feita para uma classe ou um recurso, o class laoder atual caso não encontre a classe irá delegar a busca para o class loader pai.

O sistema de class loader, primeiro pede para que a busca seja feita nos class loaders pais e suas extensões. Caso a não encontre, ele pede para que a busca seja realizada no bootstrap class loader. Se acontecer de ainda não encontrar no bootstrap e suas extensões, o sistema busca a classe em si mesmo, caso não encontre é propagada a excessãp mencionada acima.

Como consequencia, o delegation model garante uqe suas classes são unicas, pois sempre tentados delegar a execução para uma classe pai e se ela não encontra, ela tenta procurar em si mesma

Quanto a visibilidade, class loaders filhas são visiveis para serem executardas por class loaders pais

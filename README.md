# Abstração de um Bootcamp em POO - DIO

## Motivações das principais escolhas e melhorias em relação ao projeto base
- Na classe principal do programa, utilizei polimorfismo na instanciação de novos cursos e mentorias pois, dentro de um bootcamp,
um estudante pode se inscrever em ambos, mas faz mais sentido agrupá-los para gerar um atributo relacionado somente a conteúdos, em 
vez de criar atributos com diferenciações, visto que essa possível diferenciação não seria útil para o projeto.

- Nas classes "Course" e "Mentoring", resolvi aplicar um construtor para a instanciação de novos objetos em vez de utilizar, primariamente,
os métodos "set". Isso é uma boa prática no momento de criação de objetos: gerar com construtor, e apenas usar os "sets" para atualizar
informações caso necessário.

- Na classe "Dev", realizer a escolha de usar um LinkedHashSet como coleção porque não é possível alguém se inscrever mais de uma vez em algum
conteúdo, e a interface Set bloqueia a repetição de valores dentro da mesma. 

- Na classe Bootcamp, escolhi usar a interface List para agrupar os devs inscritos. Fiz dessa forma pois nomes repetidos são comuns e, caso 
ocorressem nomes repetidos com o mesmo progresso no bootcamp e a coleção usada fosse um Set, por exemplo, o sistema quebraria.

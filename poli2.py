'POLIMORFISMO DE FUNCION'

class Gato():
    def sonido(self):
        return "Miauuu"

class Perro():
    def sonido(self):
        return "Guauuu"

def hacer_sonido(animal):
    print(animal.sonido())

gato= Gato()
perro= Perro()

hacer_sonido(gato)
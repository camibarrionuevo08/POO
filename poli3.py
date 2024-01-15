'POLIMORFISMO DE HERENCIA'

class Animal():
    def sonido(self):
        pass
        
    
class Gato(Animal):
    def sonido(self):
        return "Miauuu"

class Perro(Animal):
    def sonido(self):
        return "Guauuu"

def hacer_sonido(animal):
    print(animal.sonido())

gato= Gato()
perro= Perro()

print(perro.sonido())
        
hacer_sonido(gato)
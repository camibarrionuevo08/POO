
'POLIMORFISMO DE INCLUSION -TIPADO DINAMICO'

class Gato():
    def sonido(self):
        return "Miauuu"

class Perro():
    def sonido(self):
        return "Guauuu"



gato= Gato()
perro= Perro()



print(gato.sonido())
        
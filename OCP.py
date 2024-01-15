class Notificador:
    def __init__(self, usuario, mensaje):
        self.usuario = usuario
        self.mensaje = mensaje

    def notificar(self):
        raise NotImplementedError
    

class NotificadorEmail(Notificador):
    def Notificar(self):
        print(f"Enviar mensaje a {self.usuario.email}")


class NotificadorSMS(Notificador):
    def Notificar(self):
        print(f"Enviando mensaje a {self.usuario.email}")



class NotificadorWhatsApp(Notificador):
    def Notificar(self):
        print(f"Enviando WhatsApp a {self.usuario.WhatsApp}")

class NotificadorTwitter(Notificador):
    def Notificar(self):
        print(f"Enviando Twit a {self.usuario.Twitter}")    

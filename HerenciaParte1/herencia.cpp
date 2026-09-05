#include <iostream>
using namespace std;

class Animal{
    public:
        string nombre;
        Animal(string nombre): nombre (nombre){
            cout <<"Animal constructor" <<endl;
        }

        void andar(){
            cout <<nombre<< " esta andando" << endl;
        }
        
};


class Perro : public Animal{
    public:
        Perro (string nombre) : Animal(nombre){
        }
    void ladrar(){
        cout <<nombre<<" esta ladrando"<<endl;
    }

    void andar(){
        cout<<nombre<<" esta corriendo"<<endl;
    }
};



class Volador : virtual public Animal{
    public:
    Volador (string nombre) : Animal(nombre){}
        void volar(){
            cout<< nombre <<" esta volando"<<endl;
        }
    
};

class Nadador : virtual public Animal{
    public:
    Nadador(string nombre) : Animal (nombre){}
        void nadar(){
            cout<<nombre<< " esta nadando"<< endl;
        }
};

class Pato : public Volador, public Nadador{
    public:
        Pato(string nombre) :Animal(nombre), Nadador(nombre), Volador (nombre){}    
        void graznar(){
            cout<<nombre<<" esta graznando"<<endl;
        }

        void andar(){
            cout <<nombre <<" esta andando"<<endl;
        }

};

int main(){
    Perro perro1("Pako");
    perro1.ladrar();
    perro1.andar();

    Pato pato1("Justin");
    pato1.andar();

    Volador volador1 ("A");
    Nadador nadador1 ("W");

    volador.andar();
    nadador.andar();
};
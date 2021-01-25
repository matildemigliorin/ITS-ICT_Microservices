    package org.example.book.models;

    import org.springframework.data.annotation.Id;
    import org.springframework.data.mongodb.core.mapping.Document;

    @Document
    public class User {

        @Id
        private String userId;
        private String nome;
        private String cognome;

        public String getNome(){
        return nome;
        }
        public String getCognome(){
        return cognome;
        }
        public String getuserId(){
            return userId;
        }

        public void setNome(String nome){
            this.nome=nome;
        }
        public void setCognome(String cognome) {
            this.cognome = cognome;
        }
        public void setUserId(String userId) {
            this.userId = userId;
        }

        @Override
        public String toString(){
            return this.nome + " " +this.cognome;
        }
    }

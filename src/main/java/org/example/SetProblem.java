package org.example;

import java.util.Objects;

public class SetProblem {

     public static class User {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

         @Override
         public boolean equals(Object o) {
             if (o == null || getClass() != o.getClass()) return false;
             User user = (User) o;
             return age == user.age && Objects.equals(name, user.name);
         }

         @Override
         public int hashCode() {
             return Objects.hash(name, age);
         }

         public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}

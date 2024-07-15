package per.huashao.work3;

public class Collage{
        int id;
        String name;

        public Collage() {
        }

        public Collage(int id, String name) {
                this.id = id;
                this.name = name;
        }

        public void setId(int id) {
                this.id = id;
        }

        public void setName(String name) {
                this.name = name;
        }

        @Override
        public String toString() {
                return "Collage{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}';
        }
}
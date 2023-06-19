import java.lang.reflect.InvocationTargetException;

public class Reflaction {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = ClasseAnotacao.class;
        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela annotation = clazz.getAnnotation(Tabela.class);
            String nomeTabela = annotation.nome();
            System.out.println(nomeTabela);


        }
    }
}

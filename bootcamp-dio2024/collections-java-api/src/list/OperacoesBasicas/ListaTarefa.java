package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
      List<Tarefa> tarefaParaRemover = new ArrayList<>();

      for(Tarefa t : tarefaList) {
          if (t.getDescricao().equalsIgnoreCase(descricao)) {
              tarefaParaRemover.add(t);
          }
      }

      tarefaList.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 2");

        listaTarefa.obterDescricoesTarefas();

        listaTarefa.removerTarefa("tarefa 1");

        listaTarefa.obterDescricoesTarefas();


        System.out.println("Número total de tarefas: "+listaTarefa.obterNumeroTotalTarefas());
    }
}

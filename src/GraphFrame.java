
import com.mxgraph.layout.mxCircleLayout;
import com.mxgraph.swing.mxGraphComponent;
import java.awt.Dimension;
import javax.swing.JFrame;
import com.mxgraph.view.mxGraph;

public class GraphFrame extends JFrame {

    private final int[][] matrizDeAdyacencia;

    public GraphFrame(int[][] adjacencyMatrix) {
        this.matrizDeAdyacencia = adjacencyMatrix;
        mxGraph graph = new mxGraph();
        Object parent = graph.getDefaultParent();
        graph.getModel().beginUpdate();
        try {
            int nodos = adjacencyMatrix.length;
            Object[] vertex = new Object[nodos];
            for (int i = 0; i < nodos; i++) {
                vertex[i] = graph.insertVertex(parent, null, i, 20, 20, 30, 30);
            }
            for (int i = 0; i < nodos; i++) {
                for (int j = 0; j < nodos; j++) {
                    if (adjacencyMatrix[i][j] == 1) {
                        graph.insertEdge(parent, null, "", vertex[i], vertex[j]);
                    }
                }
            }
        } finally {
            graph.getModel().endUpdate();
        }
        mxGraphComponent graphComponent = new mxGraphComponent(graph);
        mxCircleLayout layout = new mxCircleLayout(graph);
        layout.execute(graph.getDefaultParent());
        getContentPane().add(graphComponent);
        setPreferredSize(new Dimension(400, 300));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
    }
}

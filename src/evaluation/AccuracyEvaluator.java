package evaluation;

import graph_clustering.utils.AccuracyGauge;

public class AccuracyEvaluator {
	private static final String CUT_RESULT_FILENAME = "report_shared_neigbor_cut.txt";
	private static final String MERGE_RESULT_FILENAME = "report_shared_neigbor_merge.txt";
	private static final String GROUND_TRUTH_FILENAME = "complex_merged.txt";
	private static final String GRAPH_ENTROPY_RESULT_FILENAME = "report_graph_entropy.txt";
	
	public static void main(String[] args) {
		System.out.println(AccuracyGauge.fscore(CUT_RESULT_FILENAME, GROUND_TRUTH_FILENAME));
		System.out.println(AccuracyGauge.fscore(MERGE_RESULT_FILENAME, GROUND_TRUTH_FILENAME));
		System.out.println(AccuracyGauge.fscore(GRAPH_ENTROPY_RESULT_FILENAME, GROUND_TRUTH_FILENAME));
	}

}
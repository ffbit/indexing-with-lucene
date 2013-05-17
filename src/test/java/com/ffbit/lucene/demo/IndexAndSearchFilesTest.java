package com.ffbit.lucene.demo;

import org.apache.lucene.demo.IndexFiles;
import org.apache.lucene.demo.SearchFiles;
import org.junit.Test;

public class IndexAndSearchFilesTest {
    private String index = "lucene-index";
    private String docs = "src/test/resources/docs";
    private String queries = "src/test/resources/queries.txt";

    @Test
    public void simpleIndexingAndSearching() throws Exception {
        IndexFiles.main(new String[]{"-docs", docs, "-index", index, "-update"});
        SearchFiles.main(new String[]{"-index", index, "-queries", queries});
    }

}

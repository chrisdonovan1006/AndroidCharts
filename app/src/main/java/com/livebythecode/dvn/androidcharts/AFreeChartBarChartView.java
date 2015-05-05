package com.livebythecode.dvn.androidcharts;

import android.content.Context;

import org.afree.data.category.CategoryDataset;
import org.afree.data.category.DefaultCategoryDataset;

/**
 * Created by Christopher on 05/05/2015.
 */
public class AFreeChartBarChartView extends DemoView{
    public AFreeChartBarChartView(Context context) {
        super(context);
        CategoryDataset dataset = createDataset();
        AFreeChart chart = createChart(dataset);

       //  setChart(chart);
    }

    private AFreeChart createChart(CategoryDataset dataset) {
        /*// create the chart...
        AFreeChart chart = ChartFactory.createBarChart(
                "AFreeChart Bar Chart",      // chart title
                "Year",               // domain axis label
                "Sales/Expenses",         // range axis label
                dataset,                  // data
                PlotOrientation.VERTICAL, // orientation
                true,                     // include legend
                true,                     // tooltips?
                false                     // URLs?
        );

        // NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...

        // set the background color for the chart...
        chart.setBackgroundPaintType(new SolidColor(Color.WHITE));

        // get a reference to the plot for further customisation...
        CategoryPlot plot = (CategoryPlot) chart.getPlot();

        // set the range axis to display integers only...
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // disable bar outlines...
        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);

        // set up gradient paints for series...
        GradientColor gp0 = new GradientColor(Color.BLUE, Color.rgb(51, 102, 204));
        GradientColor gp1 = new GradientColor(Color.RED, Color.rgb(255, 0, 0));
        renderer.setSeriesPaintType(0, gp0);
        renderer.setSeriesPaintType(1, gp1);

        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
                CategoryLabelPositions.createUpRotationLabelPositions(
                        Math.PI / 6.0));
        // OPTIONAL CUSTOMISATION COMPLETED.

        return chart;*/
        return null;

    }

    private CategoryDataset createDataset() {
        // row keys...
        String series1 = "Sales";
        String series2 = "Expenses";

        // column keys...
        String category1 = "2010";
        String category2 = "2011";
        String category3 = "2012";
        String category4 = "2013";

        // create the dataset...
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue(1.0, series1, category1);
        dataset.addValue(4.0, series1, category2);
        dataset.addValue(3.0, series1, category3);
        dataset.addValue(8.0, series1, category4);

        dataset.addValue(5.0, series2, category1);
        dataset.addValue(7.0, series2, category2);
        dataset.addValue(6.0, series2, category3);
        dataset.addValue(5.0, series2, category4);

        return dataset;
    }
}

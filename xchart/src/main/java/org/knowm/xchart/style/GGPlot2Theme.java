/**
 * Copyright 2015-2017 Knowm Inc. (http://knowm.org) and contributors.
 * Copyright 2011-2015 Xeiam LLC (http://xeiam.com) and contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.knowm.xchart.style;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Stroke;

import org.knowm.xchart.style.PieStyler.AnnotationType;
import org.knowm.xchart.style.colors.ChartColor;
import org.knowm.xchart.style.colors.GGPlot2SeriesColors;
import org.knowm.xchart.style.lines.GGPlot2SeriesLines;
import org.knowm.xchart.style.markers.GGPlot2SeriesMarkers;
import org.knowm.xchart.style.markers.Marker;

/**
 * @author timmolter
 */
public class GGPlot2Theme extends AbstractBaseTheme {

  // Chart Style ///////////////////////////////

  // SeriesMarkers, SeriesLines, SeriesColors ///////////////////////////////

  @Override
  public Marker[] getSeriesMarkers() {

    return new GGPlot2SeriesMarkers().getSeriesMarkers();
  }

  @Override
  public BasicStroke[] getSeriesLines() {

    return new GGPlot2SeriesLines().getSeriesLines();
  }

  @Override
  public Color[] getSeriesColors() {

    return new GGPlot2SeriesColors().getSeriesColors();
  }

  // Chart Title ///////////////////////////////

  @Override
  public Font getChartTitleFont() {

    return getBaseFont().deriveFont(14f);
  }

  @Override
  public Color getChartTitleBoxBackgroundColor() {

    return ChartColor.getAWTColor(ChartColor.GREY);
  }

  @Override
  public Color getChartTitleBoxBorderColor() {

    return ChartColor.getAWTColor(ChartColor.GREY);
  }

  // Chart Legend ///////////////////////////////

  @Override
  public Font getLegendFont() {

	return getBaseFont().deriveFont(14f);
  }

  @Override
  public Color getLegendBorderColor() {

    return ChartColor.getAWTColor(ChartColor.WHITE);
  }

  // Chart Axes ///////////////////////////////

  @Override
  public Font getAxisTitleFont() {

    return getBaseFont().deriveFont(14f);
  }

  @Override
  public Font getAxisTickLabelsFont() {

    return getBaseFont().deriveFont(Font.BOLD).deriveFont(13f);
  }

  @Override
  public int getAxisTickMarkLength() {

    return 8;
  }

  @Override
  public int getAxisTickPadding() {

    return 5;
  }

  @Override
  public Stroke getAxisTickMarksStroke() {

    return new BasicStroke(1.5f);
  }

  @Override
  public Color getAxisTickLabelsColor() {

    return ChartColor.getAWTColor(ChartColor.DARK_GREY);
  }

  @Override
  public boolean isAxisTicksLineVisible() {

	  return false;
  }

  // Chart Plot Area ///////////////////////////////

  @Override
  public Color getPlotBackgroundColor() {

    return ChartColor.getAWTColor(ChartColor.LIGHT_GREY);
  }

  @Override
  public Color getPlotBorderColor() {

    return ChartColor.getAWTColor(ChartColor.WHITE);
  }

  @Override
  public boolean isPlotBorderVisible() {

    return false;
  }

  @Override
  public boolean isPlotTicksMarksVisible() {

    return false;
  }

  @Override
  public Color getPlotGridLinesColor() {

    return ChartColor.getAWTColor(ChartColor.WHITE);
  }

  @Override
  public Stroke getPlotGridLinesStroke() {

    return new BasicStroke(1.0f);
  }

  @Override
  public int getPlotMargin() {

    return 0;
  }

  // Category Charts ///////////////////////////////

  // Pie Charts ///////////////////////////////

  @Override
  public AnnotationType getAnnotationType() {

    return AnnotationType.LabelAndPercentage;
  }

  @Override
  public double getDonutThickness() {

    return .25;
  }

  // Line, Scatter, Area Charts ///////////////////////////////

  // Error Bars ///////////////////////////////

  @Override
  public Color getErrorBarsColor() {

    return ChartColor.getAWTColor(ChartColor.DARK_GREY);
  }

  // Annotations ///////////////////////////////

}

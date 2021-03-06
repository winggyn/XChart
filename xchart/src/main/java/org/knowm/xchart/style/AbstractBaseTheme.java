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
import org.knowm.xchart.style.Styler.LegendPosition;
import org.knowm.xchart.style.colors.BaseSeriesColors;
import org.knowm.xchart.style.colors.ChartColor;
import org.knowm.xchart.style.lines.BaseSeriesLines;
import org.knowm.xchart.style.markers.BaseSeriesMarkers;
import org.knowm.xchart.style.markers.Marker;

/**
 * @author timmolter
 * @author ekleinod
 */
public abstract class AbstractBaseTheme implements Theme {

  public static final Font BASE_FONT = new Font(Font.SANS_SERIF, Font.PLAIN, 10);

  // Chart Style ///////////////////////////////

  @Override
  public Font getBaseFont() {

	return BASE_FONT;
  }

  @Override
  public Color getChartBackgroundColor() {

    return ChartColor.getAWTColor(ChartColor.WHITE);
  }

  @Override
  public Color getChartFontColor() {

    return ChartColor.getAWTColor(ChartColor.BLACK);
  }

  @Override
  public int getChartPadding() {

    return 10;
  }

  // SeriesMarkers, SeriesLines, SeriesColors ///////////////////////////////

  @Override
  public Color[] getSeriesColors() {

    return new BaseSeriesColors().getSeriesColors();
  }

  @Override
  public Marker[] getSeriesMarkers() {

    return new BaseSeriesMarkers().getSeriesMarkers();
  }

  @Override
  public BasicStroke[] getSeriesLines() {

    return new BaseSeriesLines().getSeriesLines();
  }

  // Chart Title ///////////////////////////////

  /**
   * Base font, bold, size 14.
   */
  @Override
  public Font getChartTitleFont() {

	return getBaseFont().deriveFont(Font.BOLD).deriveFont(14f);
  }

  @Override
  public boolean isChartTitleVisible() {

    return true;
  }

  @Override
  public boolean isChartTitleBoxVisible() {

    return true;
  }

  @Override
  public Color getChartTitleBoxBackgroundColor() {

    return ChartColor.getAWTColor(ChartColor.WHITE);
  }

  @Override
  public Color getChartTitleBoxBorderColor() {

    return ChartColor.getAWTColor(ChartColor.WHITE);
  }

  @Override
  public int getChartTitlePadding() {

    return 5;
  }

  // Chart Legend ///////////////////////////////

  /**
   * Base font, size 11.
   */
  @Override
  public Font getLegendFont() {

	return getBaseFont().deriveFont(11f);
  }

  @Override
  public boolean isLegendVisible() {

    return true;
  }

  @Override
  public Color getLegendBackgroundColor() {

    return ChartColor.getAWTColor(ChartColor.WHITE);
  }

  @Override
  public Color getLegendBorderColor() {

    return ChartColor.getAWTColor(ChartColor.DARK_GREY);
  }

  @Override
  public int getLegendPadding() {

    return 10;
  }

  @Override
  public int getLegendSeriesLineLength() {

    return 24;
  }

  @Override
  public LegendPosition getLegendPosition() {

    return LegendPosition.OutsideE;
  }

  // Chart Axes ///////////////////////////////

  @Override
  public boolean isXAxisTitleVisible() {

    return true;
  }

  @Override
  public boolean isYAxisTitleVisible() {

    return true;
  }

  /**
   * Base font, bold, size 12.
   */
  @Override
  public Font getAxisTitleFont() {

    return getBaseFont().deriveFont(Font.BOLD).deriveFont(12f);
  }

  @Override
  public boolean isXAxisTicksVisible() {

    return true;
  }

  @Override
  public boolean isYAxisTicksVisible() {

    return true;
  }

  /**
   * Axis title font.
   */
  @Override
  public Font getAxisTickLabelsFont() {

	return getAxisTitleFont();
  }

  @Override
  public int getAxisTickMarkLength() {

    return 3;
  }

  @Override
  public int getAxisTickPadding() {

    return 4;
  }

  @Override
  public Color getAxisTickMarksColor() {

	  return ChartColor.getAWTColor(ChartColor.DARK_GREY);
  }

  @Override
  public Stroke getAxisTickMarksStroke() {

    return new BasicStroke(1.0f);
  }

  @Override
  public Color getAxisTickLabelsColor() {

    return ChartColor.getAWTColor(ChartColor.BLACK);
  }

  @Override
  public boolean isAxisTicksLineVisible() {

    return true;
  }

  @Override
  public boolean isAxisTicksMarksVisible() {

    return true;
  }

  @Override
  public int getAxisTitlePadding() {

    return 10;
  }

  @Override
  public int getXAxisTickMarkSpacingHint() {

    return 74;
  }

  @Override
  public int getYAxisTickMarkSpacingHint() {

    return 44;
  }

  // Chart Plot Area ///////////////////////////////

  @Override
  public boolean isPlotGridLinesVisible() {

    return true;
  }

  @Override
  public boolean isPlotGridVerticalLinesVisible() {

    return true;
  }

  @Override
  public boolean isPlotGridHorizontalLinesVisible() {

    return true;
  }

  @Override
  public Color getPlotBackgroundColor() {

    return ChartColor.getAWTColor(ChartColor.WHITE);
  }

  @Override
  public Color getPlotBorderColor() {

    return ChartColor.getAWTColor(ChartColor.DARK_GREY);
  }

  @Override
  public boolean isPlotBorderVisible() {

    return true;
  }

  @Override
  public boolean isPlotTicksMarksVisible() {

    return true;
  }

  @Override
  public Color getPlotGridLinesColor() {

    return ChartColor.getAWTColor(ChartColor.GREY);
  }

  @Override
  public Stroke getPlotGridLinesStroke() {

    return new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 10.0f, new float[]{3.0f, 5.0f}, 0.0f);
  }

  @Override
  public double getPlotContentSize() {

    return .92;
  }

  @Override
  public int getPlotMargin() {

    return 4;
  }

  // Category Charts ///////////////////////////////

  @Override
  public double getAvailableSpaceFill() {

    return 0.9;
  }

  @Override
  public boolean isOverlapped() {

    return false;
  }

  // Pie Charts ///////////////////////////////

  @Override
  public boolean isCircular() {

    return true;
  }

  @Override
  public double getStartAngleInDegrees() {

    return 0;
  }

  /**
   * Base font, size 15.
   */
  @Override
  public Font getPieFont() {

    return getBaseFont().deriveFont(15f);
  }

  @Override
  public double getAnnotationDistance() {

    return .67;
  }

  @Override
  public AnnotationType getAnnotationType() {

    return AnnotationType.Percentage;
  }

  @Override
  public boolean isDrawAllAnnotations() {

    return false;
  }

  @Override
  public double getDonutThickness() {

    return .33;
  }

  @Override
  public boolean isSumVisible() {

  	return false;
  }

  /**
   * Annotations font.
   */
  @Override
  public Font getSumFont() {

    return getAnnotationFont();
  }

  // Line, Scatter, Area Charts ///////////////////////////////

  @Override
  public int getMarkerSize() {

    return 8;
  }

  @Override
  public boolean showMarkers() {

    return true;
  }

  // Error Bars ///////////////////////////////

  @Override
  public Color getErrorBarsColor() {

    return ChartColor.getAWTColor(ChartColor.BLACK);
  }

  @Override
  public boolean isErrorBarsColorSeriesColor() {

    return false;
  }

  // Annotations ///////////////////////////////

  /**
   * Pie font, size 12.
   */
  @Override
  public Font getAnnotationFont() {

    return getPieFont().deriveFont(12f);
  }
}

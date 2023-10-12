import React from "react";
import { Pie } from "react-chartjs-2";
import { ArcElement, Chart as ChartJS, Legend, Tooltip } from "chart.js"; // Import Chart from Chart.js

ChartJS.register(ArcElement, Tooltip, Legend);

type PieChartProps = {
  chartData: any;
};

const PieChart: React.FC<PieChartProps> = ({ chartData }) => {
  return <Pie data={chartData} />;
};

export default PieChart;

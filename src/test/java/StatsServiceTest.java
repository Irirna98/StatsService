import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;


public class StatsServiceTest {
    @Test
    public void SalesAmount() {
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void averagSales() {
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageAmount(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 20;
        int actual = service.PeakSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.MinimumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessThanAverageSales() {
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.sumSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void AboveAverage() {
        StatsService service = new StatsService();
        long sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 2;
        int actual = service.AboveAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}


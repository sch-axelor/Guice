package guice;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class NamedAnnotationExample {

    public interface Draw {
        void draw();
    }

    public static class DrawSquare implements Draw {
        private String label;

        @Inject
        public DrawSquare(@Named("Square") String label) {
            this.label = label;
        }

        @Override
        public void draw() {
            System.out.println("Drawing square with label: " + label);
        }
    }

    public static class DrawCircle implements Draw {
        private String label;

        @Inject
        public DrawCircle(@Named("Circle") String label) {
            this.label = label;
        }

        @Override
        public void draw() {
            System.out.println("Drawing circle with label: " + label);
        }
    }

    public static class DrawingModule extends AbstractModule {
        @Override
        protected void configure() {
            bind(String.class).annotatedWith(Names.named("Square")).toInstance("Square Label");
            bind(String.class).annotatedWith(Names.named("Circle")).toInstance("Circle Label");

            bind(Draw.class).annotatedWith(Names.named("Square")).to(DrawSquare.class);
            bind(Draw.class).annotatedWith(Names.named("Circle")).to(DrawCircle.class);
        }
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DrawingModule());

        Draw squareDrawer = injector.getInstance(Key.get(Draw.class, Names.named("Square")));
        squareDrawer.draw();

        Draw circleDrawer = injector.getInstance(Key.get(Draw.class, Names.named("Circle")));
        circleDrawer.draw();
    }
}


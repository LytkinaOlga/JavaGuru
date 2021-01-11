//package by.bntu.fitr.poisit.lytkina;
//
//import java.util.Objects;
//
//public class OuterClass {
//    private String outerName;
//    private static String outerStaticField;
//    public static final String OUTER_STATIC_FIELD = "";
//
//    public OuterClass(String outerName) {
//        this.outerName = outerName;
//    }
//
//    public OuterClass() {
//    }
//
//    public String getOuterName() {
//        return outerName;
//    }
//
//    public void setOuterName(String outerName) {
//        this.outerName = outerName;
//    }
//
//    public static String getOuterStaticField() {
//        return outerStaticField;
//    }
//
//    public static void setOuterStaticField(String outerStaticField) {
//        OuterClass.outerStaticField = outerStaticField;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        OuterClass that = (OuterClass) o;
//        return Objects.equals(outerName, that.outerName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(outerName);
//    }
//
//    @Override
//    public String toString() {
//        return "OuterClass{" +
//                "outerName='" + outerName + '\'' +
//                '}';
//    }
//
//    public void hasAccess(){
//        String access;
//
//
//        access = OuterClass.outerStaticField;
//        access = StaticNestedClass.staticNestedStaticField;
//        access = InnerClass.innerStaticField;
//
//        access = OuterClass.OUTER_STATIC_FIELD;
//        access = StaticNestedClass.STATIC_NESTED_STATIC_FIELD;
//        access = InnerClass.OUTER_STATIC_FIELD;
//
//        OuterClass outerClass = new OuterClass();
//        access = outerClass.outerName;
//        OuterClass.StaticNestedClass staticNestedClass = new StaticNestedClass();
//        OuterClass.StaticNestedClass staticNestedClass = outerClass.new StaticNestedClass(); //error
//        access = staticNestedClass.staticNestedName;
//        InnerClass innerClass = outerClass.new InnerClass();
//        InnerClass innerClass = new InnerClass();
//        access = innerClass.innerName;
//    }
//
//    public static class StaticNestedClass{
//        private String staticNestedName;
//        private static String staticNestedStaticField;
//        public static final String STATIC_NESTED_STATIC_FIELD = "";
//
//        public StaticNestedClass() {
//        }
//
//        public StaticNestedClass(String staticNestedName) {
//            this.staticNestedName = staticNestedName;
//        }
//
//        public String getStaticNestedName() {
//            return staticNestedName;
//        }
//
//        public void setStaticNestedName(String staticNestedName) {
//            this.staticNestedName = staticNestedName;
//        }
//
//        public static String getStaticNestedStaticField() {
//            return staticNestedStaticField;
//        }
//
//        public static void setStaticNestedStaticField(String staticNestedStaticField) {
//            StaticNestedClass.staticNestedStaticField = staticNestedStaticField;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            StaticNestedClass that = (StaticNestedClass) o;
//            return Objects.equals(staticNestedName, that.staticNestedName);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(staticNestedName);
//        }
//
//        @Override
//        public String toString() {
//            return "StaticNestedClass{" +
//                    "staticNestedName='" + staticNestedName + '\'' +
//                    '}';
//        }
//
//        public void staticNestedHasAccess() {
//            String access;
//        }
//
//    }
//    public class InnerClass{
//        private String innerName;
//        private static String innerStaticField = "";
//        public static final String OUTER_STATIC_FIELD = "";
//
//        public InnerClass() {
//        }
//
//        public InnerClass(String innerName) {
//            this.innerName = innerName;
//        }
//
//        public String getInnerName() {
//            return innerName;
//        }
//
//        public void setInnerName(String innerName) {
//            this.innerName = innerName;
//        }
//
//        public static String getInnerStaticField() {
//            return innerStaticField;
//        }
//
//        public static void setInnerStaticField(String innerStaticField) {
//            InnerClass.innerStaticField = innerStaticField;
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            InnerClass that = (InnerClass) o;
//            return Objects.equals(innerName, that.innerName);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(innerName);
//        }
//
//        @Override
//        public String toString() {
//            return "InnerClass{" +
//                    "innerName='" + innerName + '\'' +
//                    '}';
//        }
//        public void innerHasAccess(){
//
//        }
//    }
//}
//

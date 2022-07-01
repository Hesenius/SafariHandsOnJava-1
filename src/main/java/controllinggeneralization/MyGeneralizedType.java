package controllinggeneralization;

public sealed interface MyGeneralizedType
  permits SpecializedOne, SpecializedTwo {
}

/*non-sealed*/ /*sealed*/ final class SpecializedOne implements MyGeneralizedType {
}

final class SpecializedTwo implements MyGeneralizedType {
}

//class BadSpecializedFour extends SpecializedTwo {}

// this shouldn't exist! (by our design model)
//class BadSpecializedThree implements MyGeneralizedType {
//}
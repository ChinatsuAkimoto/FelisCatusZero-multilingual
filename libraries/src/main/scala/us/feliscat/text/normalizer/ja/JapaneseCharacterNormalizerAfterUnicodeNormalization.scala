package us.feliscat.text.normalizer.ja

import us.feliscat.text.StringOption
import us.feliscat.text.normalizer.DictionaryBasedNormalizer

/**
  * @author K.Sakamoto
  *         Created on 2016/02/20
  */
object JapaneseCharacterNormalizerAfterUnicodeNormalization
  extends DictionaryBasedNormalizer(
    StringOption("character_dic_after_unicode_normalization.yml"))

// automatically generated by the FlatBuffers compiler, do not modify


#ifndef FLATBUFFERS_GENERATED_RANGES_DEXKIT_SCHEMA_H_
#define FLATBUFFERS_GENERATED_RANGES_DEXKIT_SCHEMA_H_

#include "flatbuffers/flatbuffers.h"

// Ensure the included flatbuffers.h is the same version as when this file was
// generated, otherwise it may not be compatible.
static_assert(FLATBUFFERS_VERSION_MAJOR == 23 &&
              FLATBUFFERS_VERSION_MINOR == 5 &&
              FLATBUFFERS_VERSION_REVISION == 26,
             "Non-compatible flatbuffers version included");

namespace dexkit {
namespace schema {

struct IntRange;
struct IntRangeBuilder;

struct LongRange;
struct LongRangeBuilder;

struct IntRange FLATBUFFERS_FINAL_CLASS : private ::flatbuffers::Table {
  typedef IntRangeBuilder Builder;
  struct Traits;
  enum FlatBuffersVTableOffset FLATBUFFERS_VTABLE_UNDERLYING_TYPE {
    VT_MIN = 4,
    VT_MAX = 6
  };
  int32_t min() const {
    return GetField<int32_t>(VT_MIN, 0);
  }
  int32_t max() const {
    return GetField<int32_t>(VT_MAX, 0);
  }
  bool Verify(::flatbuffers::Verifier &verifier) const {
    return VerifyTableStart(verifier) &&
           VerifyField<int32_t>(verifier, VT_MIN, 4) &&
           VerifyField<int32_t>(verifier, VT_MAX, 4) &&
           verifier.EndTable();
  }
};

struct IntRangeBuilder {
  typedef IntRange Table;
  ::flatbuffers::FlatBufferBuilder &fbb_;
  ::flatbuffers::uoffset_t start_;
  void add_min(int32_t min) {
    fbb_.AddElement<int32_t>(IntRange::VT_MIN, min, 0);
  }
  void add_max(int32_t max) {
    fbb_.AddElement<int32_t>(IntRange::VT_MAX, max, 0);
  }
  explicit IntRangeBuilder(::flatbuffers::FlatBufferBuilder &_fbb)
        : fbb_(_fbb) {
    start_ = fbb_.StartTable();
  }
  ::flatbuffers::Offset<IntRange> Finish() {
    const auto end = fbb_.EndTable(start_);
    auto o = ::flatbuffers::Offset<IntRange>(end);
    return o;
  }
};

inline ::flatbuffers::Offset<IntRange> CreateIntRange(
    ::flatbuffers::FlatBufferBuilder &_fbb,
    int32_t min = 0,
    int32_t max = 0) {
  IntRangeBuilder builder_(_fbb);
  builder_.add_max(max);
  builder_.add_min(min);
  return builder_.Finish();
}

struct IntRange::Traits {
  using type = IntRange;
  static auto constexpr Create = CreateIntRange;
};

struct LongRange FLATBUFFERS_FINAL_CLASS : private ::flatbuffers::Table {
  typedef LongRangeBuilder Builder;
  struct Traits;
  enum FlatBuffersVTableOffset FLATBUFFERS_VTABLE_UNDERLYING_TYPE {
    VT_MIN = 4,
    VT_MAX = 6
  };
  int64_t min() const {
    return GetField<int64_t>(VT_MIN, 0);
  }
  int64_t max() const {
    return GetField<int64_t>(VT_MAX, 0);
  }
  bool Verify(::flatbuffers::Verifier &verifier) const {
    return VerifyTableStart(verifier) &&
           VerifyField<int64_t>(verifier, VT_MIN, 8) &&
           VerifyField<int64_t>(verifier, VT_MAX, 8) &&
           verifier.EndTable();
  }
};

struct LongRangeBuilder {
  typedef LongRange Table;
  ::flatbuffers::FlatBufferBuilder &fbb_;
  ::flatbuffers::uoffset_t start_;
  void add_min(int64_t min) {
    fbb_.AddElement<int64_t>(LongRange::VT_MIN, min, 0);
  }
  void add_max(int64_t max) {
    fbb_.AddElement<int64_t>(LongRange::VT_MAX, max, 0);
  }
  explicit LongRangeBuilder(::flatbuffers::FlatBufferBuilder &_fbb)
        : fbb_(_fbb) {
    start_ = fbb_.StartTable();
  }
  ::flatbuffers::Offset<LongRange> Finish() {
    const auto end = fbb_.EndTable(start_);
    auto o = ::flatbuffers::Offset<LongRange>(end);
    return o;
  }
};

inline ::flatbuffers::Offset<LongRange> CreateLongRange(
    ::flatbuffers::FlatBufferBuilder &_fbb,
    int64_t min = 0,
    int64_t max = 0) {
  LongRangeBuilder builder_(_fbb);
  builder_.add_max(max);
  builder_.add_min(min);
  return builder_.Finish();
}

struct LongRange::Traits {
  using type = LongRange;
  static auto constexpr Create = CreateLongRange;
};

}  // namespace schema
}  // namespace dexkit

#endif  // FLATBUFFERS_GENERATED_RANGES_DEXKIT_SCHEMA_H_
